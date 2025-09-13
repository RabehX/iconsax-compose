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

val Iconsax.Outline.Truck: ImageVector
    get() {
        if (_Truck != null) {
            return _Truck!!
        }
        _Truck = ImageVector.Builder(
            name = "Outline.Truck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 14.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 14.75f, 1.25f, 14.41f, 1.25f, 14f)
                verticalLineTo(6f)
                curveTo(1.25f, 3.38f, 3.38f, 1.25f, 6f, 1.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 1.25f, 15.75f, 1.59f, 15.75f, 2f)
                verticalLineTo(12f)
                curveTo(15.75f, 13.52f, 14.52f, 14.75f, 13f, 14.75f)
                close()
                moveTo(2.75f, 13.25f)
                horizontalLineTo(13f)
                curveTo(13.69f, 13.25f, 14.25f, 12.69f, 14.25f, 12f)
                verticalLineTo(2.75f)
                horizontalLineTo(6f)
                curveTo(4.21f, 2.75f, 2.75f, 4.21f, 2.75f, 6f)
                verticalLineTo(13.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 20.75f)
                horizontalLineTo(18f)
                curveTo(17.59f, 20.75f, 17.25f, 20.41f, 17.25f, 20f)
                curveTo(17.25f, 19.31f, 16.69f, 18.75f, 16f, 18.75f)
                curveTo(15.31f, 18.75f, 14.75f, 19.31f, 14.75f, 20f)
                curveTo(14.75f, 20.41f, 14.41f, 20.75f, 14f, 20.75f)
                horizontalLineTo(10f)
                curveTo(9.59f, 20.75f, 9.25f, 20.41f, 9.25f, 20f)
                curveTo(9.25f, 19.31f, 8.69f, 18.75f, 8f, 18.75f)
                curveTo(7.31f, 18.75f, 6.75f, 19.31f, 6.75f, 20f)
                curveTo(6.75f, 20.41f, 6.41f, 20.75f, 6f, 20.75f)
                horizontalLineTo(5f)
                curveTo(2.93f, 20.75f, 1.25f, 19.07f, 1.25f, 17f)
                verticalLineTo(14f)
                curveTo(1.25f, 13.59f, 1.59f, 13.25f, 2f, 13.25f)
                horizontalLineTo(13f)
                curveTo(13.69f, 13.25f, 14.25f, 12.69f, 14.25f, 12f)
                verticalLineTo(5f)
                curveTo(14.25f, 4.59f, 14.59f, 4.25f, 15f, 4.25f)
                horizontalLineTo(16.84f)
                curveTo(17.83f, 4.25f, 18.74f, 4.78f, 19.23f, 5.64f)
                lineTo(20.94f, 8.63f)
                curveTo(21.07f, 8.86f, 21.07f, 9.15f, 20.94f, 9.38f)
                curveTo(20.81f, 9.61f, 20.56f, 9.75f, 20.29f, 9.75f)
                horizontalLineTo(19f)
                curveTo(18.86f, 9.75f, 18.75f, 9.86f, 18.75f, 10f)
                verticalLineTo(13f)
                curveTo(18.75f, 13.14f, 18.86f, 13.25f, 19f, 13.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 13.25f, 22.75f, 13.59f, 22.75f, 14f)
                verticalLineTo(17f)
                curveTo(22.75f, 19.07f, 21.07f, 20.75f, 19f, 20.75f)
                close()
                moveTo(18.65f, 19.25f)
                horizontalLineTo(19f)
                curveTo(20.24f, 19.25f, 21.25f, 18.24f, 21.25f, 17f)
                verticalLineTo(14.75f)
                horizontalLineTo(19f)
                curveTo(18.04f, 14.75f, 17.25f, 13.96f, 17.25f, 13f)
                verticalLineTo(10f)
                curveTo(17.25f, 9.04f, 18.03f, 8.25f, 19f, 8.25f)
                lineTo(17.93f, 6.38f)
                curveTo(17.71f, 5.99f, 17.29f, 5.75f, 16.84f, 5.75f)
                horizontalLineTo(15.75f)
                verticalLineTo(12f)
                curveTo(15.75f, 13.52f, 14.52f, 14.75f, 13f, 14.75f)
                horizontalLineTo(2.75f)
                verticalLineTo(17f)
                curveTo(2.75f, 18.24f, 3.76f, 19.25f, 5f, 19.25f)
                horizontalLineTo(5.35f)
                curveTo(5.68f, 18.1f, 6.74f, 17.25f, 8f, 17.25f)
                curveTo(9.26f, 17.25f, 10.32f, 18.1f, 10.65f, 19.25f)
                horizontalLineTo(13.36f)
                curveTo(13.69f, 18.1f, 14.75f, 17.25f, 16.01f, 17.25f)
                curveTo(17.27f, 17.25f, 18.32f, 18.1f, 18.65f, 19.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 22.75f)
                curveTo(6.48f, 22.75f, 5.25f, 21.52f, 5.25f, 20f)
                curveTo(5.25f, 18.48f, 6.48f, 17.25f, 8f, 17.25f)
                curveTo(9.52f, 17.25f, 10.75f, 18.48f, 10.75f, 20f)
                curveTo(10.75f, 21.52f, 9.52f, 22.75f, 8f, 22.75f)
                close()
                moveTo(8f, 18.75f)
                curveTo(7.31f, 18.75f, 6.75f, 19.31f, 6.75f, 20f)
                curveTo(6.75f, 20.69f, 7.31f, 21.25f, 8f, 21.25f)
                curveTo(8.69f, 21.25f, 9.25f, 20.69f, 9.25f, 20f)
                curveTo(9.25f, 19.31f, 8.69f, 18.75f, 8f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                curveTo(14.48f, 22.75f, 13.25f, 21.52f, 13.25f, 20f)
                curveTo(13.25f, 18.48f, 14.48f, 17.25f, 16f, 17.25f)
                curveTo(17.52f, 17.25f, 18.75f, 18.48f, 18.75f, 20f)
                curveTo(18.75f, 21.52f, 17.52f, 22.75f, 16f, 22.75f)
                close()
                moveTo(16f, 18.75f)
                curveTo(15.31f, 18.75f, 14.75f, 19.31f, 14.75f, 20f)
                curveTo(14.75f, 20.69f, 15.31f, 21.25f, 16f, 21.25f)
                curveTo(16.69f, 21.25f, 17.25f, 20.69f, 17.25f, 20f)
                curveTo(17.25f, 19.31f, 16.69f, 18.75f, 16f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 14.75f)
                horizontalLineTo(19f)
                curveTo(18.04f, 14.75f, 17.25f, 13.96f, 17.25f, 13f)
                verticalLineTo(10f)
                curveTo(17.25f, 9.04f, 18.04f, 8.25f, 19f, 8.25f)
                horizontalLineTo(20.29f)
                curveTo(20.56f, 8.25f, 20.81f, 8.39f, 20.94f, 8.63f)
                lineTo(22.65f, 11.63f)
                curveTo(22.71f, 11.74f, 22.75f, 11.87f, 22.75f, 12f)
                verticalLineTo(14f)
                curveTo(22.75f, 14.41f, 22.41f, 14.75f, 22f, 14.75f)
                close()
                moveTo(19f, 9.75f)
                curveTo(18.86f, 9.75f, 18.75f, 9.86f, 18.75f, 10f)
                verticalLineTo(13f)
                curveTo(18.75f, 13.14f, 18.86f, 13.25f, 19f, 13.25f)
                horizontalLineTo(21.25f)
                verticalLineTo(12.2f)
                lineTo(19.85f, 9.75f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _Truck!!
    }

@Suppress("ObjectPropertyName")
private var _Truck: ImageVector? = null
