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


val Iconsax.Filled.RotateRight: ImageVector
    get() {
        if (_RotateRight != null) {
            return _RotateRight!!
        }
        _RotateRight = ImageVector.Builder(
            name = "Filled.RotateRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(12f, 18.58f)
                curveTo(8.83f, 18.58f, 6.25f, 16f, 6.25f, 12.83f)
                curveTo(6.25f, 9.72f, 8.73f, 7.19f, 11.81f, 7.08f)
                lineTo(11.44f, 6.65f)
                curveTo(11.17f, 6.34f, 11.2f, 5.86f, 11.51f, 5.59f)
                curveTo(11.82f, 5.32f, 12.3f, 5.35f, 12.57f, 5.66f)
                lineTo(14.23f, 7.56f)
                curveTo(14.25f, 7.58f, 14.26f, 7.6f, 14.28f, 7.62f)
                curveTo(14.32f, 7.68f, 14.36f, 7.75f, 14.38f, 7.82f)
                curveTo(14.39f, 7.86f, 14.4f, 7.9f, 14.41f, 7.94f)
                curveTo(14.43f, 8.03f, 14.42f, 8.13f, 14.4f, 8.22f)
                curveTo(14.38f, 8.3f, 14.35f, 8.38f, 14.31f, 8.46f)
                curveTo(14.3f, 8.48f, 14.28f, 8.5f, 14.27f, 8.52f)
                curveTo(14.23f, 8.58f, 14.17f, 8.63f, 14.11f, 8.67f)
                curveTo(14.11f, 8.67f, 14.1f, 8.67f, 14.1f, 8.68f)
                lineTo(12.16f, 10.1f)
                curveTo(11.82f, 10.34f, 11.36f, 10.27f, 11.11f, 9.94f)
                curveTo(10.87f, 9.61f, 10.94f, 9.14f, 11.27f, 8.89f)
                lineTo(11.68f, 8.59f)
                curveTo(9.48f, 8.75f, 7.74f, 10.59f, 7.74f, 12.83f)
                curveTo(7.74f, 15.17f, 9.65f, 17.08f, 11.99f, 17.08f)
                curveTo(14.33f, 17.08f, 16.24f, 15.17f, 16.24f, 12.83f)
                curveTo(16.24f, 11.99f, 15.99f, 11.17f, 15.53f, 10.47f)
                curveTo(15.3f, 10.13f, 15.39f, 9.66f, 15.74f, 9.43f)
                curveTo(16.09f, 9.2f, 16.55f, 9.29f, 16.78f, 9.64f)
                curveTo(17.41f, 10.59f, 17.75f, 11.69f, 17.75f, 12.83f)
                curveTo(17.75f, 16f, 15.17f, 18.58f, 12f, 18.58f)
                close()
            }
        }.build()

        return _RotateRight!!
    }

@Suppress("ObjectPropertyName")
private var _RotateRight: ImageVector? = null
