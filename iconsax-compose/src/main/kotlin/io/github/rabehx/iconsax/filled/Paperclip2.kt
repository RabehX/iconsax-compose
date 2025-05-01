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


val Iconsax.Filled.Paperclip2: ImageVector
    get() {
        if (_Paperclip2 != null) {
            return _Paperclip2!!
        }
        _Paperclip2 = ImageVector.Builder(
            name = "Filled.Paperclip2",
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
                moveTo(16.37f, 14.63f)
                lineTo(14.15f, 16.85f)
                curveTo(13.61f, 17.39f, 12.91f, 17.65f, 12.21f, 17.65f)
                curveTo(11.51f, 17.65f, 10.8f, 17.38f, 10.27f, 16.85f)
                curveTo(9.2f, 15.78f, 9.2f, 14.03f, 10.27f, 12.96f)
                lineTo(11.68f, 11.55f)
                curveTo(11.97f, 11.26f, 12.45f, 11.26f, 12.74f, 11.55f)
                curveTo(13.03f, 11.84f, 13.03f, 12.32f, 12.74f, 12.61f)
                lineTo(11.33f, 14.02f)
                curveTo(10.84f, 14.51f, 10.84f, 15.3f, 11.33f, 15.79f)
                curveTo(11.82f, 16.28f, 12.61f, 16.28f, 13.1f, 15.79f)
                lineTo(15.32f, 13.57f)
                curveTo(15.93f, 12.96f, 16.27f, 12.14f, 16.27f, 11.27f)
                curveTo(16.27f, 10.4f, 15.93f, 9.59f, 15.32f, 8.97f)
                curveTo(14.09f, 7.74f, 11.95f, 7.74f, 10.72f, 8.97f)
                lineTo(8.29f, 11.4f)
                curveTo(7.25f, 12.44f, 7.25f, 14.14f, 8.29f, 15.19f)
                curveTo(8.58f, 15.48f, 8.58f, 15.96f, 8.29f, 16.25f)
                curveTo(8f, 16.54f, 7.52f, 16.54f, 7.23f, 16.25f)
                curveTo(5.6f, 14.62f, 5.6f, 11.97f, 7.23f, 10.34f)
                lineTo(9.65f, 7.92f)
                curveTo(10.55f, 7.02f, 11.74f, 6.53f, 13.01f, 6.53f)
                curveTo(14.28f, 6.53f, 15.47f, 7.02f, 16.37f, 7.92f)
                curveTo(17.27f, 8.82f, 17.76f, 10.01f, 17.76f, 11.28f)
                curveTo(17.76f, 12.55f, 17.27f, 13.74f, 16.37f, 14.63f)
                close()
            }
        }.build()

        return _Paperclip2!!
    }

@Suppress("ObjectPropertyName")
private var _Paperclip2: ImageVector? = null
