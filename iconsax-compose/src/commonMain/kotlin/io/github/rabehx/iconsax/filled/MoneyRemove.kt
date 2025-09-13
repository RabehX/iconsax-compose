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


val Iconsax.Filled.MoneyRemove: ImageVector
    get() {
        if (_MoneyRemove != null) {
            return _MoneyRemove!!
        }
        _MoneyRemove = ImageVector.Builder(
            name = "Filled.MoneyRemove",
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
                curveTo(3.8f, 14f, 2.73f, 14.53f, 2f, 15.36f)
                curveTo(1.38f, 16.07f, 1f, 16.99f, 1f, 18f)
                curveTo(1f, 18.75f, 1.21f, 19.46f, 1.58f, 20.06f)
                curveTo(2.27f, 21.22f, 3.54f, 22f, 5f, 22f)
                curveTo(6.01f, 22f, 6.93f, 21.63f, 7.63f, 21f)
                curveTo(7.94f, 20.74f, 8.21f, 20.42f, 8.42f, 20.06f)
                curveTo(8.79f, 19.46f, 9f, 18.75f, 9f, 18f)
                curveTo(9f, 15.79f, 7.21f, 14f, 5f, 14f)
                close()
                moveTo(6.6f, 19.58f)
                curveTo(6.45f, 19.73f, 6.26f, 19.8f, 6.07f, 19.8f)
                curveTo(5.88f, 19.8f, 5.69f, 19.73f, 5.54f, 19.58f)
                lineTo(5.01f, 19.05f)
                lineTo(4.46f, 19.6f)
                curveTo(4.31f, 19.75f, 4.12f, 19.82f, 3.93f, 19.82f)
                curveTo(3.74f, 19.82f, 3.55f, 19.75f, 3.4f, 19.6f)
                curveTo(3.11f, 19.31f, 3.11f, 18.83f, 3.4f, 18.54f)
                lineTo(3.95f, 17.99f)
                lineTo(3.42f, 17.46f)
                curveTo(3.13f, 17.17f, 3.13f, 16.69f, 3.42f, 16.4f)
                curveTo(3.71f, 16.11f, 4.19f, 16.11f, 4.48f, 16.4f)
                lineTo(5.01f, 16.93f)
                lineTo(5.51f, 16.43f)
                curveTo(5.8f, 16.14f, 6.28f, 16.14f, 6.57f, 16.43f)
                curveTo(6.86f, 16.72f, 6.86f, 17.2f, 6.57f, 17.49f)
                lineTo(6.07f, 17.99f)
                lineTo(6.6f, 18.52f)
                curveTo(6.89f, 18.81f, 6.89f, 19.28f, 6.6f, 19.58f)
                close()
            }
        }.build()

        return _MoneyRemove!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyRemove: ImageVector? = null
