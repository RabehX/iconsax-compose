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


val Iconsax.Filled.HomeTrendDown: ImageVector
    get() {
        if (_HomeTrendDown != null) {
            return _HomeTrendDown!!
        }
        _HomeTrendDown = ImageVector.Builder(
            name = "Filled.HomeTrendDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.04f, 6.822f)
                lineTo(14.28f, 2.792f)
                curveTo(12.71f, 1.692f, 10.3f, 1.752f, 8.79f, 2.922f)
                lineTo(3.78f, 6.832f)
                curveTo(2.78f, 7.612f, 1.99f, 9.212f, 1.99f, 10.472f)
                verticalLineTo(17.372f)
                curveTo(1.99f, 19.922f, 4.06f, 22.002f, 6.61f, 22.002f)
                horizontalLineTo(17.39f)
                curveTo(19.94f, 22.002f, 22.01f, 19.932f, 22.01f, 17.382f)
                verticalLineTo(10.602f)
                curveTo(22.01f, 9.252f, 21.14f, 7.592f, 20.04f, 6.822f)
                close()
                moveTo(16.88f, 16.192f)
                curveTo(16.88f, 16.282f, 16.86f, 16.372f, 16.83f, 16.462f)
                curveTo(16.76f, 16.632f, 16.62f, 16.772f, 16.45f, 16.842f)
                curveTo(16.36f, 16.882f, 16.27f, 16.892f, 16.18f, 16.892f)
                horizontalLineTo(14.32f)
                curveTo(13.93f, 16.892f, 13.62f, 16.582f, 13.62f, 16.192f)
                curveTo(13.62f, 15.802f, 13.93f, 15.492f, 14.32f, 15.492f)
                horizontalLineTo(14.5f)
                lineTo(12.39f, 13.382f)
                lineTo(11.37f, 14.902f)
                curveTo(11.25f, 15.072f, 11.07f, 15.192f, 10.86f, 15.212f)
                curveTo(10.64f, 15.232f, 10.45f, 15.162f, 10.3f, 15.012f)
                lineTo(7.32f, 12.032f)
                curveTo(7.05f, 11.762f, 7.05f, 11.322f, 7.32f, 11.042f)
                curveTo(7.59f, 10.762f, 8.03f, 10.772f, 8.31f, 11.042f)
                lineTo(10.69f, 13.422f)
                lineTo(11.71f, 11.902f)
                curveTo(11.83f, 11.732f, 12.01f, 11.612f, 12.22f, 11.592f)
                curveTo(12.44f, 11.572f, 12.63f, 11.642f, 12.78f, 11.792f)
                lineTo(15.5f, 14.512f)
                verticalLineTo(14.332f)
                curveTo(15.5f, 13.942f, 15.81f, 13.632f, 16.2f, 13.632f)
                curveTo(16.59f, 13.632f, 16.9f, 13.942f, 16.9f, 14.332f)
                verticalLineTo(16.192f)
                horizontalLineTo(16.88f)
                close()
            }
        }.build()

        return _HomeTrendDown!!
    }

@Suppress("ObjectPropertyName")
private var _HomeTrendDown: ImageVector? = null
