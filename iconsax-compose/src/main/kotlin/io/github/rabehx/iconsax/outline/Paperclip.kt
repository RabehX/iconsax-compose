/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Paperclip: ImageVector
    get() {
        if (_Paperclip != null) {
            return _Paperclip!!
        }
        _Paperclip = ImageVector.Builder(
            name = "Outline.Paperclip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.971f, 22.75f)
                curveTo(7.251f, 22.75f, 4.221f, 19.72f, 4.221f, 16f)
                verticalLineTo(10f)
                curveTo(4.221f, 5.73f, 7.701f, 2.25f, 11.971f, 2.25f)
                curveTo(16.241f, 2.25f, 19.721f, 5.73f, 19.721f, 10f)
                verticalLineTo(15.5f)
                curveTo(19.721f, 17.84f, 17.811f, 19.75f, 15.471f, 19.75f)
                curveTo(13.131f, 19.75f, 11.221f, 17.84f, 11.221f, 15.5f)
                verticalLineTo(12f)
                curveTo(11.221f, 11.59f, 11.561f, 11.25f, 11.971f, 11.25f)
                curveTo(12.381f, 11.25f, 12.721f, 11.59f, 12.721f, 12f)
                verticalLineTo(15.5f)
                curveTo(12.721f, 17.02f, 13.951f, 18.25f, 15.471f, 18.25f)
                curveTo(16.991f, 18.25f, 18.221f, 17.02f, 18.221f, 15.5f)
                verticalLineTo(10f)
                curveTo(18.221f, 6.55f, 15.421f, 3.75f, 11.971f, 3.75f)
                curveTo(8.521f, 3.75f, 5.721f, 6.55f, 5.721f, 10f)
                verticalLineTo(16f)
                curveTo(5.721f, 18.89f, 8.071f, 21.25f, 10.971f, 21.25f)
                curveTo(11.381f, 21.25f, 11.721f, 21.59f, 11.721f, 22f)
                curveTo(11.721f, 22.41f, 11.391f, 22.75f, 10.971f, 22.75f)
                close()
            }
        }.build()

        return _Paperclip!!
    }

@Suppress("ObjectPropertyName")
private var _Paperclip: ImageVector? = null
