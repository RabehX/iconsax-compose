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


val Iconsax.Filled.DocumentDownload: ImageVector
    get() {
        if (_DocumentDownload != null) {
            return _DocumentDownload!!
        }
        _DocumentDownload = ImageVector.Builder(
            name = "Filled.DocumentDownload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 10.19f)
                horizontalLineTo(17.61f)
                curveTo(15.24f, 10.19f, 13.31f, 8.26f, 13.31f, 5.89f)
                verticalLineTo(3f)
                curveTo(13.31f, 2.45f, 12.86f, 2f, 12.31f, 2f)
                horizontalLineTo(8.07f)
                curveTo(4.99f, 2f, 2.5f, 4f, 2.5f, 7.57f)
                verticalLineTo(16.43f)
                curveTo(2.5f, 20f, 4.99f, 22f, 8.07f, 22f)
                horizontalLineTo(15.93f)
                curveTo(19.01f, 22f, 21.5f, 20f, 21.5f, 16.43f)
                verticalLineTo(11.19f)
                curveTo(21.5f, 10.64f, 21.05f, 10.19f, 20.5f, 10.19f)
                close()
                moveTo(12.28f, 15.78f)
                lineTo(10.28f, 17.78f)
                curveTo(10.21f, 17.85f, 10.12f, 17.91f, 10.03f, 17.94f)
                curveTo(9.94f, 17.98f, 9.85f, 18f, 9.75f, 18f)
                curveTo(9.65f, 18f, 9.56f, 17.98f, 9.47f, 17.94f)
                curveTo(9.39f, 17.91f, 9.31f, 17.85f, 9.25f, 17.79f)
                curveTo(9.24f, 17.78f, 9.23f, 17.78f, 9.23f, 17.77f)
                lineTo(7.23f, 15.77f)
                curveTo(6.94f, 15.48f, 6.94f, 15f, 7.23f, 14.71f)
                curveTo(7.52f, 14.42f, 8f, 14.42f, 8.29f, 14.71f)
                lineTo(9f, 15.44f)
                verticalLineTo(11.25f)
                curveTo(9f, 10.84f, 9.34f, 10.5f, 9.75f, 10.5f)
                curveTo(10.16f, 10.5f, 10.5f, 10.84f, 10.5f, 11.25f)
                verticalLineTo(15.44f)
                lineTo(11.22f, 14.72f)
                curveTo(11.51f, 14.43f, 11.99f, 14.43f, 12.28f, 14.72f)
                curveTo(12.57f, 15.01f, 12.57f, 15.49f, 12.28f, 15.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.43f, 8.81f)
                curveTo(18.38f, 8.82f, 19.7f, 8.82f, 20.83f, 8.82f)
                curveTo(21.4f, 8.82f, 21.7f, 8.15f, 21.3f, 7.75f)
                curveTo(19.86f, 6.3f, 17.28f, 3.69f, 15.8f, 2.21f)
                curveTo(15.39f, 1.8f, 14.68f, 2.08f, 14.68f, 2.65f)
                verticalLineTo(6.14f)
                curveTo(14.68f, 7.6f, 15.92f, 8.81f, 17.43f, 8.81f)
                close()
            }
        }.build()

        return _DocumentDownload!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentDownload: ImageVector? = null
