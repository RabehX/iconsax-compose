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

val Iconsax.Outline.Musicnote: ImageVector
    get() {
        if (_Musicnote != null) {
            return _Musicnote!!
        }
        _Musicnote = ImageVector.Builder(
            name = "Outline.Musicnote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.971f, 22.75f)
                curveTo(5.351f, 22.75f, 3.221f, 20.62f, 3.221f, 18f)
                curveTo(3.221f, 15.38f, 5.351f, 13.25f, 7.971f, 13.25f)
                curveTo(10.591f, 13.25f, 12.721f, 15.38f, 12.721f, 18f)
                curveTo(12.721f, 20.62f, 10.591f, 22.75f, 7.971f, 22.75f)
                close()
                moveTo(7.971f, 14.75f)
                curveTo(6.181f, 14.75f, 4.721f, 16.21f, 4.721f, 18f)
                curveTo(4.721f, 19.79f, 6.181f, 21.25f, 7.971f, 21.25f)
                curveTo(9.761f, 21.25f, 11.221f, 19.79f, 11.221f, 18f)
                curveTo(11.221f, 16.21f, 9.771f, 14.75f, 7.971f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.971f, 18.75f)
                curveTo(11.561f, 18.75f, 11.221f, 18.41f, 11.221f, 18f)
                verticalLineTo(4f)
                curveTo(11.221f, 3.59f, 11.561f, 3.25f, 11.971f, 3.25f)
                curveTo(12.381f, 3.25f, 12.721f, 3.59f, 12.721f, 4f)
                verticalLineTo(18f)
                curveTo(12.721f, 18.41f, 12.391f, 18.75f, 11.971f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.131f, 10.23f)
                curveTo(18.801f, 10.23f, 18.451f, 10.17f, 18.111f, 10.06f)
                lineTo(13.691f, 8.59f)
                curveTo(12.311f, 8.13f, 11.231f, 6.63f, 11.231f, 5.18f)
                verticalLineTo(4f)
                curveTo(11.231f, 3.03f, 11.63f, 2.19f, 12.311f, 1.69f)
                curveTo(13f, 1.19f, 13.92f, 1.09f, 14.84f, 1.39f)
                lineTo(19.26f, 2.86f)
                curveTo(20.64f, 3.32f, 21.721f, 4.82f, 21.721f, 6.27f)
                verticalLineTo(7.44f)
                curveTo(21.721f, 8.41f, 21.32f, 9.25f, 20.64f, 9.75f)
                curveTo(20.211f, 10.08f, 19.681f, 10.23f, 19.131f, 10.23f)
                close()
                moveTo(13.821f, 2.72f)
                curveTo(13.58f, 2.72f, 13.361f, 2.78f, 13.191f, 2.91f)
                curveTo(12.891f, 3.12f, 12.731f, 3.51f, 12.731f, 4f)
                verticalLineTo(5.17f)
                curveTo(12.731f, 5.97f, 13.401f, 6.9f, 14.16f, 7.16f)
                lineTo(18.58f, 8.63f)
                curveTo(19.041f, 8.79f, 19.471f, 8.75f, 19.76f, 8.54f)
                curveTo(20.06f, 8.33f, 20.221f, 7.94f, 20.221f, 7.45f)
                verticalLineTo(6.28f)
                curveTo(20.221f, 5.48f, 19.551f, 4.55f, 18.791f, 4.29f)
                lineTo(14.37f, 2.82f)
                curveTo(14.181f, 2.75f, 13.991f, 2.72f, 13.821f, 2.72f)
                close()
            }
        }.build()

        return _Musicnote!!
    }

@Suppress("ObjectPropertyName")
private var _Musicnote: ImageVector? = null
