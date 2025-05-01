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


val Iconsax.Filled.MoneyChange: ImageVector
    get() {
        if (_MoneyChange != null) {
            return _MoneyChange!!
        }
        _MoneyChange = ImageVector.Builder(
            name = "Filled.MoneyChange",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 4f)
                horizontalLineTo(7f)
                curveTo(4f, 4f, 2f, 5.5f, 2f, 9f)
                verticalLineTo(12.56f)
                curveTo(2f, 12.93f, 2.38f, 13.16f, 2.71f, 13.01f)
                curveTo(3.69f, 12.56f, 4.82f, 12.39f, 6.01f, 12.6f)
                curveTo(8.64f, 13.07f, 10.57f, 15.51f, 10.5f, 18.18f)
                curveTo(10.49f, 18.6f, 10.43f, 19.01f, 10.32f, 19.41f)
                curveTo(10.24f, 19.72f, 10.49f, 20.01f, 10.81f, 20.01f)
                horizontalLineTo(17f)
                curveTo(20f, 20.01f, 22f, 18.51f, 22f, 15.01f)
                verticalLineTo(9f)
                curveTo(22f, 5.5f, 20f, 4f, 17f, 4f)
                close()
                moveTo(12f, 14.5f)
                curveTo(10.62f, 14.5f, 9.5f, 13.38f, 9.5f, 12f)
                curveTo(9.5f, 10.62f, 10.62f, 9.5f, 12f, 9.5f)
                curveTo(13.38f, 9.5f, 14.5f, 10.62f, 14.5f, 12f)
                curveTo(14.5f, 13.38f, 13.38f, 14.5f, 12f, 14.5f)
                close()
                moveTo(19.25f, 14f)
                curveTo(19.25f, 14.41f, 18.91f, 14.75f, 18.5f, 14.75f)
                curveTo(18.09f, 14.75f, 17.75f, 14.41f, 17.75f, 14f)
                verticalLineTo(10f)
                curveTo(17.75f, 9.59f, 18.09f, 9.25f, 18.5f, 9.25f)
                curveTo(18.91f, 9.25f, 19.25f, 9.59f, 19.25f, 10f)
                verticalLineTo(14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 14f)
                curveTo(3.75f, 14f, 2.62f, 14.59f, 1.89f, 15.49f)
                curveTo(1.33f, 16.18f, 1f, 17.05f, 1f, 18f)
                curveTo(1f, 20.21f, 2.8f, 22f, 5f, 22f)
                curveTo(6.74f, 22f, 8.23f, 20.89f, 8.77f, 19.33f)
                curveTo(8.92f, 18.92f, 9f, 18.47f, 9f, 18f)
                curveTo(9f, 15.8f, 7.21f, 14f, 5f, 14f)
                close()
                moveTo(7.36f, 19.74f)
                curveTo(7.34f, 19.8f, 7.3f, 19.86f, 7.26f, 19.9f)
                lineTo(6.54f, 20.61f)
                curveTo(6.45f, 20.71f, 6.33f, 20.75f, 6.2f, 20.75f)
                curveTo(6.07f, 20.75f, 5.94f, 20.71f, 5.85f, 20.61f)
                curveTo(5.69f, 20.46f, 5.67f, 20.22f, 5.77f, 20.04f)
                horizontalLineTo(3.76f)
                curveTo(3.12f, 20.04f, 2.6f, 19.52f, 2.6f, 18.87f)
                verticalLineTo(18.77f)
                curveTo(2.6f, 18.49f, 2.82f, 18.28f, 3.09f, 18.28f)
                curveTo(3.36f, 18.28f, 3.58f, 18.49f, 3.58f, 18.77f)
                verticalLineTo(18.87f)
                curveTo(3.58f, 18.98f, 3.66f, 19.07f, 3.77f, 19.07f)
                horizontalLineTo(5.78f)
                curveTo(5.68f, 18.88f, 5.7f, 18.65f, 5.86f, 18.49f)
                curveTo(6.05f, 18.3f, 6.36f, 18.3f, 6.54f, 18.49f)
                lineTo(7.26f, 19.21f)
                curveTo(7.3f, 19.25f, 7.34f, 19.31f, 7.37f, 19.37f)
                curveTo(7.41f, 19.48f, 7.41f, 19.62f, 7.36f, 19.74f)
                close()
                moveTo(7.4f, 17.23f)
                curveTo(7.4f, 17.51f, 7.18f, 17.72f, 6.91f, 17.72f)
                curveTo(6.64f, 17.72f, 6.42f, 17.51f, 6.42f, 17.23f)
                verticalLineTo(17.13f)
                curveTo(6.42f, 17.02f, 6.34f, 16.93f, 6.23f, 16.93f)
                horizontalLineTo(4.23f)
                curveTo(4.33f, 17.12f, 4.31f, 17.35f, 4.15f, 17.51f)
                curveTo(4.06f, 17.6f, 3.94f, 17.65f, 3.8f, 17.65f)
                curveTo(3.68f, 17.65f, 3.55f, 17.6f, 3.46f, 17.51f)
                lineTo(2.74f, 16.79f)
                curveTo(2.7f, 16.75f, 2.66f, 16.69f, 2.63f, 16.63f)
                curveTo(2.59f, 16.51f, 2.59f, 16.38f, 2.63f, 16.26f)
                curveTo(2.66f, 16.21f, 2.69f, 16.14f, 2.74f, 16.1f)
                lineTo(3.46f, 15.39f)
                curveTo(3.65f, 15.19f, 3.96f, 15.19f, 4.14f, 15.39f)
                curveTo(4.3f, 15.54f, 4.32f, 15.78f, 4.22f, 15.96f)
                horizontalLineTo(6.23f)
                curveTo(6.87f, 15.96f, 7.39f, 16.48f, 7.39f, 17.13f)
                verticalLineTo(17.23f)
                horizontalLineTo(7.4f)
                close()
            }
        }.build()

        return _MoneyChange!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyChange: ImageVector? = null
