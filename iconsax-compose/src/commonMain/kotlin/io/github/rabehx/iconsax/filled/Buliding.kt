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


val Iconsax.Filled.Buliding: ImageVector
    get() {
        if (_Buliding != null) {
            return _Buliding!!
        }
        _Buliding = ImageVector.Builder(
            name = "Filled.Buliding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 21.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 21.25f, 1.25f, 21.59f, 1.25f, 22f)
                curveTo(1.25f, 22.41f, 1.59f, 22.75f, 2f, 22.75f)
                horizontalLineTo(22f)
                curveTo(22.41f, 22.75f, 22.75f, 22.41f, 22.75f, 22f)
                curveTo(22.75f, 21.59f, 22.41f, 21.25f, 22f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                curveTo(4f, 2f, 3f, 3.79f, 3f, 6f)
                verticalLineTo(22f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                curveTo(21f, 3.79f, 20f, 2f, 17f, 2f)
                close()
                moveTo(10f, 17.25f)
                horizontalLineTo(7f)
                curveTo(6.59f, 17.25f, 6.25f, 16.91f, 6.25f, 16.5f)
                curveTo(6.25f, 16.09f, 6.59f, 15.75f, 7f, 15.75f)
                horizontalLineTo(10f)
                curveTo(10.41f, 15.75f, 10.75f, 16.09f, 10.75f, 16.5f)
                curveTo(10.75f, 16.91f, 10.41f, 17.25f, 10f, 17.25f)
                close()
                moveTo(10f, 12.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 12.75f, 6.25f, 12.41f, 6.25f, 12f)
                curveTo(6.25f, 11.59f, 6.59f, 11.25f, 7f, 11.25f)
                horizontalLineTo(10f)
                curveTo(10.41f, 11.25f, 10.75f, 11.59f, 10.75f, 12f)
                curveTo(10.75f, 12.41f, 10.41f, 12.75f, 10f, 12.75f)
                close()
                moveTo(10f, 8.25f)
                horizontalLineTo(7f)
                curveTo(6.59f, 8.25f, 6.25f, 7.91f, 6.25f, 7.5f)
                curveTo(6.25f, 7.09f, 6.59f, 6.75f, 7f, 6.75f)
                horizontalLineTo(10f)
                curveTo(10.41f, 6.75f, 10.75f, 7.09f, 10.75f, 7.5f)
                curveTo(10.75f, 7.91f, 10.41f, 8.25f, 10f, 8.25f)
                close()
                moveTo(17f, 17.25f)
                horizontalLineTo(14f)
                curveTo(13.59f, 17.25f, 13.25f, 16.91f, 13.25f, 16.5f)
                curveTo(13.25f, 16.09f, 13.59f, 15.75f, 14f, 15.75f)
                horizontalLineTo(17f)
                curveTo(17.41f, 15.75f, 17.75f, 16.09f, 17.75f, 16.5f)
                curveTo(17.75f, 16.91f, 17.41f, 17.25f, 17f, 17.25f)
                close()
                moveTo(17f, 12.75f)
                horizontalLineTo(14f)
                curveTo(13.59f, 12.75f, 13.25f, 12.41f, 13.25f, 12f)
                curveTo(13.25f, 11.59f, 13.59f, 11.25f, 14f, 11.25f)
                horizontalLineTo(17f)
                curveTo(17.41f, 11.25f, 17.75f, 11.59f, 17.75f, 12f)
                curveTo(17.75f, 12.41f, 17.41f, 12.75f, 17f, 12.75f)
                close()
                moveTo(17f, 8.25f)
                horizontalLineTo(14f)
                curveTo(13.59f, 8.25f, 13.25f, 7.91f, 13.25f, 7.5f)
                curveTo(13.25f, 7.09f, 13.59f, 6.75f, 14f, 6.75f)
                horizontalLineTo(17f)
                curveTo(17.41f, 6.75f, 17.75f, 7.09f, 17.75f, 7.5f)
                curveTo(17.75f, 7.91f, 17.41f, 8.25f, 17f, 8.25f)
                close()
            }
        }.build()

        return _Buliding!!
    }

@Suppress("ObjectPropertyName")
private var _Buliding: ImageVector? = null
