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


val Iconsax.Filled.HomeTrendUp: ImageVector
    get() {
        if (_HomeTrendUp != null) {
            return _HomeTrendUp!!
        }
        _HomeTrendUp = ImageVector.Builder(
            name = "Filled.HomeTrendUp",
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
                moveTo(16.88f, 13.402f)
                curveTo(16.88f, 13.792f, 16.57f, 14.102f, 16.18f, 14.102f)
                curveTo(15.79f, 14.102f, 15.48f, 13.792f, 15.48f, 13.402f)
                verticalLineTo(13.222f)
                lineTo(12.76f, 15.942f)
                curveTo(12.61f, 16.092f, 12.41f, 16.162f, 12.2f, 16.142f)
                curveTo(12f, 16.122f, 11.81f, 16.002f, 11.7f, 15.832f)
                lineTo(10.68f, 14.312f)
                lineTo(8.3f, 16.692f)
                curveTo(8.16f, 16.832f, 7.99f, 16.892f, 7.81f, 16.892f)
                curveTo(7.63f, 16.892f, 7.45f, 16.822f, 7.32f, 16.692f)
                curveTo(7.05f, 16.422f, 7.05f, 15.982f, 7.32f, 15.702f)
                lineTo(10.3f, 12.722f)
                curveTo(10.45f, 12.572f, 10.65f, 12.502f, 10.86f, 12.522f)
                curveTo(11.07f, 12.542f, 11.26f, 12.652f, 11.37f, 12.832f)
                lineTo(12.39f, 14.352f)
                lineTo(14.5f, 12.242f)
                horizontalLineTo(14.32f)
                curveTo(13.93f, 12.242f, 13.62f, 11.932f, 13.62f, 11.542f)
                curveTo(13.62f, 11.152f, 13.93f, 10.842f, 14.32f, 10.842f)
                horizontalLineTo(16.18f)
                curveTo(16.27f, 10.842f, 16.36f, 10.862f, 16.45f, 10.892f)
                curveTo(16.62f, 10.962f, 16.76f, 11.102f, 16.83f, 11.272f)
                curveTo(16.87f, 11.362f, 16.88f, 11.452f, 16.88f, 11.542f)
                verticalLineTo(13.402f)
                close()
            }
        }.build()

        return _HomeTrendUp!!
    }

@Suppress("ObjectPropertyName")
private var _HomeTrendUp: ImageVector? = null
