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


val Iconsax.Filled.NoteFavorite: ImageVector
    get() {
        if (_NoteFavorite != null) {
            return _NoteFavorite!!
        }
        _NoteFavorite = ImageVector.Builder(
            name = "Filled.NoteFavorite",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.75f, 3.5f)
                verticalLineTo(2f)
                curveTo(7.75f, 1.59f, 7.41f, 1.25f, 7f, 1.25f)
                curveTo(6.59f, 1.25f, 6.25f, 1.59f, 6.25f, 2f)
                verticalLineTo(3.56f)
                curveTo(6.5f, 3.53f, 6.73f, 3.5f, 7f, 3.5f)
                horizontalLineTo(7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.75f, 3.56f)
                verticalLineTo(2f)
                curveTo(15.75f, 1.59f, 15.41f, 1.25f, 15f, 1.25f)
                curveTo(14.59f, 1.25f, 14.25f, 1.59f, 14.25f, 2f)
                verticalLineTo(3.5f)
                horizontalLineTo(15f)
                curveTo(15.27f, 3.5f, 15.5f, 3.53f, 15.75f, 3.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.29f, 14.97f)
                curveTo(20.52f, 14.36f, 19.55f, 14f, 18.5f, 14f)
                curveTo(17.45f, 14f, 16.46f, 14.37f, 15.69f, 14.99f)
                curveTo(14.65f, 15.81f, 14f, 17.09f, 14f, 18.5f)
                curveTo(14f, 19.34f, 14.24f, 20.15f, 14.65f, 20.81f)
                curveTo(14.97f, 21.33f, 15.38f, 21.79f, 15.87f, 22.14f)
                curveTo(16.61f, 22.68f, 17.51f, 23f, 18.5f, 23f)
                curveTo(19.64f, 23f, 20.67f, 22.58f, 21.46f, 21.88f)
                curveTo(21.81f, 21.59f, 22.11f, 21.23f, 22.35f, 20.82f)
                curveTo(22.76f, 20.15f, 23f, 19.34f, 23f, 18.5f)
                curveTo(23f, 17.07f, 22.33f, 15.79f, 21.29f, 14.97f)
                close()
                moveTo(18.5f, 20.64f)
                curveTo(18.5f, 19.46f, 17.54f, 18.5f, 16.36f, 18.5f)
                curveTo(17.54f, 18.5f, 18.5f, 17.54f, 18.5f, 16.36f)
                curveTo(18.5f, 17.54f, 19.46f, 18.5f, 20.64f, 18.5f)
                curveTo(19.46f, 18.5f, 18.5f, 19.46f, 18.5f, 20.64f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.75f, 3.56f)
                verticalLineTo(5f)
                curveTo(15.75f, 5.41f, 15.41f, 5.75f, 15f, 5.75f)
                curveTo(14.59f, 5.75f, 14.25f, 5.41f, 14.25f, 5f)
                verticalLineTo(3.5f)
                horizontalLineTo(7.75f)
                verticalLineTo(5f)
                curveTo(7.75f, 5.41f, 7.41f, 5.75f, 7f, 5.75f)
                curveTo(6.59f, 5.75f, 6.25f, 5.41f, 6.25f, 5f)
                verticalLineTo(3.56f)
                curveTo(3.3f, 3.83f, 2f, 5.73f, 2f, 8.5f)
                verticalLineTo(17f)
                curveTo(2f, 20f, 3.5f, 22f, 7f, 22f)
                horizontalLineTo(11.13f)
                curveTo(11.89f, 22f, 12.4f, 21.15f, 12.21f, 20.41f)
                curveTo(12.07f, 19.87f, 12f, 19.31f, 12f, 18.75f)
                curveTo(12f, 16.67f, 12.93f, 14.75f, 14.54f, 13.48f)
                curveTo(15.71f, 12.53f, 17.21f, 12f, 18.75f, 12f)
                horizontalLineTo(18.79f)
                curveTo(19.42f, 12f, 20f, 11.54f, 20f, 10.91f)
                verticalLineTo(8.5f)
                curveTo(20f, 5.73f, 18.7f, 3.83f, 15.75f, 3.56f)
                close()
                moveTo(9f, 16.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 16.75f, 6.25f, 16.41f, 6.25f, 16f)
                curveTo(6.25f, 15.59f, 6.59f, 15.25f, 7f, 15.25f)
                horizontalLineTo(9f)
                curveTo(9.41f, 15.25f, 9.75f, 15.59f, 9.75f, 16f)
                curveTo(9.75f, 16.41f, 9.41f, 16.75f, 9f, 16.75f)
                close()
                moveTo(12f, 11.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 11.75f, 6.25f, 11.41f, 6.25f, 11f)
                curveTo(6.25f, 10.59f, 6.59f, 10.25f, 7f, 10.25f)
                horizontalLineTo(12f)
                curveTo(12.41f, 10.25f, 12.75f, 10.59f, 12.75f, 11f)
                curveTo(12.75f, 11.41f, 12.41f, 11.75f, 12f, 11.75f)
                close()
            }
        }.build()

        return _NoteFavorite!!
    }

@Suppress("ObjectPropertyName")
private var _NoteFavorite: ImageVector? = null
