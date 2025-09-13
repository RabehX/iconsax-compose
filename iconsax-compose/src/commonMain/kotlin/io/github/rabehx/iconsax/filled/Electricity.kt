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


val Iconsax.Filled.Electricity: ImageVector
    get() {
        if (_Electricity != null) {
            return _Electricity!!
        }
        _Electricity = ImageVector.Builder(
            name = "Filled.Electricity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.59f, 5f)
                horizontalLineTo(15.25f)
                verticalLineTo(2f)
                curveTo(15.25f, 1.59f, 14.91f, 1.25f, 14.5f, 1.25f)
                curveTo(14.09f, 1.25f, 13.75f, 1.59f, 13.75f, 2f)
                verticalLineTo(5f)
                horizontalLineTo(10.25f)
                verticalLineTo(2f)
                curveTo(10.25f, 1.59f, 9.91f, 1.25f, 9.5f, 1.25f)
                curveTo(9.09f, 1.25f, 8.75f, 1.59f, 8.75f, 2f)
                verticalLineTo(5f)
                horizontalLineTo(8.41f)
                curveTo(7.36f, 5f, 6.5f, 5.86f, 6.5f, 6.91f)
                verticalLineTo(12f)
                curveTo(6.5f, 14.2f, 8f, 16f, 10.5f, 16f)
                horizontalLineTo(11.25f)
                verticalLineTo(22f)
                curveTo(11.25f, 22.41f, 11.59f, 22.75f, 12f, 22.75f)
                curveTo(12.41f, 22.75f, 12.75f, 22.41f, 12.75f, 22f)
                verticalLineTo(16f)
                horizontalLineTo(13.5f)
                curveTo(16f, 16f, 17.5f, 14.2f, 17.5f, 12f)
                verticalLineTo(6.91f)
                curveTo(17.5f, 5.86f, 16.64f, 5f, 15.59f, 5f)
                close()
            }
        }.build()

        return _Electricity!!
    }

@Suppress("ObjectPropertyName")
private var _Electricity: ImageVector? = null
