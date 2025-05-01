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


val Iconsax.Filled.TrendDown: ImageVector
    get() {
        if (_TrendDown != null) {
            return _TrendDown!!
        }
        _TrendDown = ImageVector.Builder(
            name = "Filled.TrendDown",
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
                moveTo(16.88f, 14.33f)
                curveTo(16.88f, 14.42f, 16.86f, 14.51f, 16.83f, 14.6f)
                curveTo(16.76f, 14.77f, 16.62f, 14.91f, 16.45f, 14.98f)
                curveTo(16.36f, 15.02f, 16.27f, 15.03f, 16.18f, 15.03f)
                horizontalLineTo(14.32f)
                curveTo(13.93f, 15.03f, 13.62f, 14.72f, 13.62f, 14.33f)
                curveTo(13.62f, 13.94f, 13.93f, 13.63f, 14.32f, 13.63f)
                horizontalLineTo(14.5f)
                lineTo(12.39f, 11.52f)
                lineTo(11.37f, 13.04f)
                curveTo(11.25f, 13.21f, 11.07f, 13.33f, 10.86f, 13.35f)
                curveTo(10.65f, 13.37f, 10.45f, 13.3f, 10.3f, 13.15f)
                lineTo(7.32f, 10.17f)
                curveTo(7.05f, 9.9f, 7.05f, 9.46f, 7.32f, 9.18f)
                curveTo(7.59f, 8.9f, 8.03f, 8.91f, 8.31f, 9.18f)
                lineTo(10.69f, 11.56f)
                lineTo(11.71f, 10.04f)
                curveTo(11.83f, 9.87f, 12.01f, 9.75f, 12.22f, 9.73f)
                curveTo(12.44f, 9.71f, 12.63f, 9.78f, 12.78f, 9.93f)
                lineTo(15.5f, 12.65f)
                verticalLineTo(12.47f)
                curveTo(15.5f, 12.08f, 15.81f, 11.77f, 16.2f, 11.77f)
                curveTo(16.59f, 11.77f, 16.9f, 12.08f, 16.9f, 12.47f)
                verticalLineTo(14.33f)
                horizontalLineTo(16.88f)
                close()
            }
        }.build()

        return _TrendDown!!
    }

@Suppress("ObjectPropertyName")
private var _TrendDown: ImageVector? = null
