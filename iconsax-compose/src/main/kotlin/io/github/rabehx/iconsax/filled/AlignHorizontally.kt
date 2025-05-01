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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Filled.AlignHorizontally: ImageVector
    get() {
        if (_AlignHorizontally != null) {
            return _AlignHorizontally!!
        }
        _AlignHorizontally = ImageVector.Builder(
            name = "Filled.AlignHorizontally",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.75f, 17.4f)
                verticalLineTo(6.6f)
                curveTo(4.75f, 5.1f, 5.39f, 4.5f, 6.98f, 4.5f)
                horizontalLineTo(8.02f)
                curveTo(9.61f, 4.5f, 10.25f, 5.1f, 10.25f, 6.6f)
                verticalLineTo(17.4f)
                curveTo(10.25f, 18.9f, 9.61f, 19.5f, 8.02f, 19.5f)
                horizontalLineTo(6.98f)
                curveTo(5.39f, 19.5f, 4.75f, 18.9f, 4.75f, 17.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.75f, 12.75f)
                horizontalLineTo(2.75f)
                curveTo(2.34f, 12.75f, 2f, 12.41f, 2f, 12f)
                curveTo(2f, 11.59f, 2.34f, 11.25f, 2.75f, 11.25f)
                horizontalLineTo(4.75f)
                verticalLineTo(12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.25f, 11.25f)
                horizontalLineTo(10.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(13.25f)
                verticalLineTo(11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.25f, 12.75f)
                horizontalLineTo(18.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(21.25f)
                curveTo(21.66f, 11.25f, 22f, 11.59f, 22f, 12f)
                curveTo(22f, 12.41f, 21.66f, 12.75f, 21.25f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.25f, 15.4f)
                verticalLineTo(8.6f)
                curveTo(13.25f, 7.1f, 13.89f, 6.5f, 15.48f, 6.5f)
                horizontalLineTo(16.52f)
                curveTo(18.11f, 6.5f, 18.75f, 7.1f, 18.75f, 8.6f)
                verticalLineTo(15.4f)
                curveTo(18.75f, 16.9f, 18.11f, 17.5f, 16.52f, 17.5f)
                horizontalLineTo(15.48f)
                curveTo(13.89f, 17.5f, 13.25f, 16.9f, 13.25f, 15.4f)
                close()
            }
        }.build()

        return _AlignHorizontally!!
    }

@Suppress("ObjectPropertyName")
private var _AlignHorizontally: ImageVector? = null
