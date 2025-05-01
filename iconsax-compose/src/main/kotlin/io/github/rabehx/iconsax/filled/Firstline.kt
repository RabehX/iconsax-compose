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


val Iconsax.Filled.Firstline: ImageVector
    get() {
        if (_Firstline != null) {
            return _Firstline!!
        }
        _Firstline = ImageVector.Builder(
            name = "Filled.Firstline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 5.25f)
                horizontalLineTo(14f)
                curveTo(13.59f, 5.25f, 13.25f, 4.91f, 13.25f, 4.5f)
                curveTo(13.25f, 4.09f, 13.59f, 3.75f, 14f, 3.75f)
                horizontalLineTo(21f)
                curveTo(21.41f, 3.75f, 21.75f, 4.09f, 21.75f, 4.5f)
                curveTo(21.75f, 4.91f, 21.41f, 5.25f, 21f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 10.25f)
                horizontalLineTo(14f)
                curveTo(13.59f, 10.25f, 13.25f, 9.91f, 13.25f, 9.5f)
                curveTo(13.25f, 9.09f, 13.59f, 8.75f, 14f, 8.75f)
                horizontalLineTo(21f)
                curveTo(21.41f, 8.75f, 21.75f, 9.09f, 21.75f, 9.5f)
                curveTo(21.75f, 9.91f, 21.41f, 10.25f, 21f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 15.25f)
                horizontalLineTo(3f)
                curveTo(2.59f, 15.25f, 2.25f, 14.91f, 2.25f, 14.5f)
                curveTo(2.25f, 14.09f, 2.59f, 13.75f, 3f, 13.75f)
                horizontalLineTo(21f)
                curveTo(21.41f, 13.75f, 21.75f, 14.09f, 21.75f, 14.5f)
                curveTo(21.75f, 14.91f, 21.41f, 15.25f, 21f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 20.25f)
                horizontalLineTo(3f)
                curveTo(2.59f, 20.25f, 2.25f, 19.91f, 2.25f, 19.5f)
                curveTo(2.25f, 19.09f, 2.59f, 18.75f, 3f, 18.75f)
                horizontalLineTo(21f)
                curveTo(21.41f, 18.75f, 21.75f, 19.09f, 21.75f, 19.5f)
                curveTo(21.75f, 19.91f, 21.41f, 20.25f, 21f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.92f, 3.5f)
                horizontalLineTo(5.08f)
                curveTo(3.68f, 3.5f, 3f, 4.18f, 3f, 5.58f)
                verticalLineTo(8.43f)
                curveTo(3f, 9.83f, 3.68f, 10.51f, 5.08f, 10.51f)
                horizontalLineTo(7.93f)
                curveTo(9.33f, 10.51f, 10.01f, 9.83f, 10.01f, 8.43f)
                verticalLineTo(5.58f)
                curveTo(10f, 4.18f, 9.32f, 3.5f, 7.92f, 3.5f)
                close()
            }
        }.build()

        return _Firstline!!
    }

@Suppress("ObjectPropertyName")
private var _Firstline: ImageVector? = null
