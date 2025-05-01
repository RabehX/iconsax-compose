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

val Iconsax.Outline.Send: ImageVector
    get() {
        if (_Send != null) {
            return _Send!!
        }
        _Send = ImageVector.Builder(
            name = "Outline.Send",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 22.75f)
                horizontalLineTo(3.5f)
                curveTo(3.09f, 22.75f, 2.75f, 22.41f, 2.75f, 22f)
                curveTo(2.75f, 21.59f, 3.09f, 21.25f, 3.5f, 21.25f)
                horizontalLineTo(20.5f)
                curveTo(20.91f, 21.25f, 21.25f, 21.59f, 21.25f, 22f)
                curveTo(21.25f, 22.41f, 20.91f, 22.75f, 20.5f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 18.25f)
                curveTo(18.809f, 18.25f, 18.619f, 18.18f, 18.469f, 18.03f)
                lineTo(4.469f, 4.03f)
                curveTo(4.179f, 3.74f, 4.179f, 3.26f, 4.469f, 2.97f)
                curveTo(4.759f, 2.68f, 5.239f, 2.68f, 5.529f, 2.97f)
                lineTo(19.529f, 16.97f)
                curveTo(19.819f, 17.26f, 19.819f, 17.74f, 19.529f, 18.03f)
                curveTo(19.379f, 18.18f, 19.19f, 18.25f, 19f, 18.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 14.52f)
                curveTo(4.59f, 14.52f, 4.25f, 14.18f, 4.25f, 13.77f)
                verticalLineTo(3.5f)
                curveTo(4.25f, 3.09f, 4.59f, 2.75f, 5f, 2.75f)
                horizontalLineTo(15.27f)
                curveTo(15.68f, 2.75f, 16.02f, 3.09f, 16.02f, 3.5f)
                curveTo(16.02f, 3.91f, 15.68f, 4.25f, 15.27f, 4.25f)
                horizontalLineTo(5.75f)
                verticalLineTo(13.77f)
                curveTo(5.75f, 14.18f, 5.41f, 14.52f, 5f, 14.52f)
                close()
            }
        }.build()

        return _Send!!
    }

@Suppress("ObjectPropertyName")
private var _Send: ImageVector? = null
