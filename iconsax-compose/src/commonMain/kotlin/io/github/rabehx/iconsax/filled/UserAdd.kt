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


val Iconsax.Filled.UserAdd: ImageVector
    get() {
        if (_UserAdd != null) {
            return _UserAdd!!
        }
        _UserAdd = ImageVector.Builder(
            name = "Filled.UserAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15f)
                curveTo(6.99f, 15f, 2.91f, 18.36f, 2.91f, 22.5f)
                curveTo(2.91f, 22.78f, 3.13f, 23f, 3.41f, 23f)
                horizontalLineTo(20.59f)
                curveTo(20.87f, 23f, 21.09f, 22.78f, 21.09f, 22.5f)
                curveTo(21.09f, 18.36f, 17.01f, 15f, 12f, 15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.71f, 3.66f)
                curveTo(14.81f, 2.64f, 13.47f, 2f, 12f, 2f)
                curveTo(10.6f, 2f, 9.32f, 2.57f, 8.41f, 3.51f)
                curveTo(7.54f, 4.41f, 7f, 5.65f, 7f, 7f)
                curveTo(7f, 7.94f, 7.26f, 8.82f, 7.73f, 9.57f)
                curveTo(7.98f, 10f, 8.3f, 10.39f, 8.68f, 10.71f)
                curveTo(9.55f, 11.51f, 10.71f, 12f, 12f, 12f)
                curveTo(13.83f, 12f, 15.41f, 11.02f, 16.28f, 9.57f)
                curveTo(16.54f, 9.14f, 16.74f, 8.66f, 16.85f, 8.16f)
                curveTo(16.95f, 7.79f, 17f, 7.4f, 17f, 7f)
                curveTo(17f, 5.72f, 16.51f, 4.55f, 15.71f, 3.66f)
                close()
                moveTo(13.87f, 7.92f)
                horizontalLineTo(12.94f)
                verticalLineTo(8.89f)
                curveTo(12.94f, 9.41f, 12.52f, 9.83f, 12f, 9.83f)
                curveTo(11.48f, 9.83f, 11.06f, 9.41f, 11.06f, 8.89f)
                verticalLineTo(7.92f)
                horizontalLineTo(10.13f)
                curveTo(9.61f, 7.92f, 9.19f, 7.5f, 9.19f, 6.98f)
                curveTo(9.19f, 6.46f, 9.61f, 6.04f, 10.13f, 6.04f)
                horizontalLineTo(11.06f)
                verticalLineTo(5.15f)
                curveTo(11.06f, 4.63f, 11.48f, 4.21f, 12f, 4.21f)
                curveTo(12.52f, 4.21f, 12.94f, 4.63f, 12.94f, 5.15f)
                verticalLineTo(6.04f)
                horizontalLineTo(13.87f)
                curveTo(14.39f, 6.04f, 14.81f, 6.46f, 14.81f, 6.98f)
                curveTo(14.81f, 7.5f, 14.39f, 7.92f, 13.87f, 7.92f)
                close()
            }
        }.build()

        return _UserAdd!!
    }

@Suppress("ObjectPropertyName")
private var _UserAdd: ImageVector? = null
