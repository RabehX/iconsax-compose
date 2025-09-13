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


val Iconsax.Filled.Edit: ImageVector
    get() {
        if (_Edit != null) {
            return _Edit!!
        }
        _Edit = ImageVector.Builder(
            name = "Filled.Edit",
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
                moveTo(10.95f, 17.51f)
                curveTo(10.66f, 17.8f, 10.11f, 18.08f, 9.71f, 18.14f)
                lineTo(7.25f, 18.49f)
                curveTo(7.16f, 18.5f, 7.07f, 18.51f, 6.98f, 18.51f)
                curveTo(6.57f, 18.51f, 6.19f, 18.37f, 5.92f, 18.1f)
                curveTo(5.59f, 17.77f, 5.45f, 17.29f, 5.53f, 16.76f)
                lineTo(5.88f, 14.3f)
                curveTo(5.94f, 13.89f, 6.21f, 13.35f, 6.51f, 13.06f)
                lineTo(10.97f, 8.6f)
                curveTo(11.05f, 8.81f, 11.13f, 9.02f, 11.24f, 9.26f)
                curveTo(11.34f, 9.47f, 11.45f, 9.69f, 11.57f, 9.89f)
                curveTo(11.67f, 10.06f, 11.78f, 10.22f, 11.87f, 10.34f)
                curveTo(11.98f, 10.51f, 12.11f, 10.67f, 12.19f, 10.76f)
                curveTo(12.24f, 10.83f, 12.28f, 10.88f, 12.3f, 10.9f)
                curveTo(12.55f, 11.2f, 12.84f, 11.48f, 13.09f, 11.69f)
                curveTo(13.16f, 11.76f, 13.2f, 11.8f, 13.22f, 11.81f)
                curveTo(13.37f, 11.93f, 13.52f, 12.05f, 13.65f, 12.14f)
                curveTo(13.81f, 12.26f, 13.97f, 12.37f, 14.14f, 12.46f)
                curveTo(14.34f, 12.58f, 14.56f, 12.69f, 14.78f, 12.8f)
                curveTo(15.01f, 12.9f, 15.22f, 12.99f, 15.43f, 13.06f)
                lineTo(10.95f, 17.51f)
                close()
                moveTo(17.37f, 11.09f)
                lineTo(16.45f, 12.02f)
                curveTo(16.39f, 12.08f, 16.31f, 12.11f, 16.23f, 12.11f)
                curveTo(16.2f, 12.11f, 16.16f, 12.11f, 16.14f, 12.1f)
                curveTo(14.11f, 11.52f, 12.49f, 9.9f, 11.91f, 7.87f)
                curveTo(11.88f, 7.76f, 11.91f, 7.64f, 11.99f, 7.57f)
                lineTo(12.92f, 6.64f)
                curveTo(14.44f, 5.12f, 15.89f, 5.15f, 17.38f, 6.64f)
                curveTo(18.14f, 7.4f, 18.51f, 8.13f, 18.51f, 8.89f)
                curveTo(18.5f, 9.61f, 18.13f, 10.33f, 17.37f, 11.09f)
                close()
            }
        }.build()

        return _Edit!!
    }

@Suppress("ObjectPropertyName")
private var _Edit: ImageVector? = null
