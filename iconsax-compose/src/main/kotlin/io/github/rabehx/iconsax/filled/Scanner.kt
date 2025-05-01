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


val Iconsax.Filled.Scanner: ImageVector
    get() {
        if (_Scanner != null) {
            return _Scanner!!
        }
        _Scanner = ImageVector.Builder(
            name = "Filled.Scanner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 9.75f)
                curveTo(21.59f, 9.75f, 21.25f, 9.41f, 21.25f, 9f)
                verticalLineTo(7f)
                curveTo(21.25f, 4.42f, 19.58f, 2.75f, 17f, 2.75f)
                horizontalLineTo(7f)
                curveTo(4.42f, 2.75f, 2.75f, 4.42f, 2.75f, 7f)
                verticalLineTo(9f)
                curveTo(2.75f, 9.41f, 2.41f, 9.75f, 2f, 9.75f)
                curveTo(1.59f, 9.75f, 1.25f, 9.41f, 1.25f, 9f)
                verticalLineTo(7f)
                curveTo(1.25f, 3.56f, 3.56f, 1.25f, 7f, 1.25f)
                horizontalLineTo(17f)
                curveTo(20.44f, 1.25f, 22.75f, 3.56f, 22.75f, 7f)
                verticalLineTo(9f)
                curveTo(22.75f, 9.41f, 22.41f, 9.75f, 22f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 22.75f)
                horizontalLineTo(7f)
                curveTo(3.56f, 22.75f, 1.25f, 20.44f, 1.25f, 17f)
                verticalLineTo(15f)
                curveTo(1.25f, 14.59f, 1.59f, 14.25f, 2f, 14.25f)
                curveTo(2.41f, 14.25f, 2.75f, 14.59f, 2.75f, 15f)
                verticalLineTo(17f)
                curveTo(2.75f, 19.58f, 4.42f, 21.25f, 7f, 21.25f)
                horizontalLineTo(17f)
                curveTo(19.58f, 21.25f, 21.25f, 19.58f, 21.25f, 17f)
                verticalLineTo(15f)
                curveTo(21.25f, 14.59f, 21.59f, 14.25f, 22f, 14.25f)
                curveTo(22.41f, 14.25f, 22.75f, 14.59f, 22.75f, 15f)
                verticalLineTo(17f)
                curveTo(22.75f, 20.44f, 20.44f, 22.75f, 17f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 12.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2f, 11.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12f)
                curveTo(22.75f, 12.41f, 22.41f, 12.75f, 22f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 9f)
                horizontalLineTo(7.5f)
                curveTo(7.22f, 9f, 7f, 8.78f, 7f, 8.5f)
                verticalLineTo(6.5f)
                curveTo(7f, 5.67f, 7.67f, 5f, 8.5f, 5f)
                horizontalLineTo(15.5f)
                curveTo(16.33f, 5f, 17f, 5.67f, 17f, 6.5f)
                verticalLineTo(8.5f)
                curveTo(17f, 8.78f, 16.78f, 9f, 16.5f, 9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 15f)
                horizontalLineTo(7.5f)
                curveTo(7.22f, 15f, 7f, 15.22f, 7f, 15.5f)
                verticalLineTo(17.5f)
                curveTo(7f, 18.33f, 7.67f, 19f, 8.5f, 19f)
                horizontalLineTo(15.5f)
                curveTo(16.32f, 19f, 17f, 18.33f, 17f, 17.5f)
                verticalLineTo(15.5f)
                curveTo(17f, 15.22f, 16.78f, 15f, 16.5f, 15f)
                close()
            }
        }.build()

        return _Scanner!!
    }

@Suppress("ObjectPropertyName")
private var _Scanner: ImageVector? = null
