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


val Iconsax.Filled.Notification1: ImageVector
    get() {
        if (_Notification1 != null) {
            return _Notification1!!
        }
        _Notification1 = ImageVector.Builder(
            name = "Filled.Notification1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 8f)
                curveTo(20.657f, 8f, 22f, 6.657f, 22f, 5f)
                curveTo(22f, 3.343f, 20.657f, 2f, 19f, 2f)
                curveTo(17.343f, 2f, 16f, 3.343f, 16f, 5f)
                curveTo(16f, 6.657f, 17.343f, 8f, 19f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 10.4f)
                verticalLineTo(16.48f)
                curveTo(21f, 16.62f, 20.99f, 16.76f, 20.98f, 16.89f)
                curveTo(20.97f, 17.01f, 20.96f, 17.12f, 20.94f, 17.24f)
                curveTo(20.93f, 17.36f, 20.91f, 17.48f, 20.89f, 17.59f)
                curveTo(20.54f, 20.01f, 19f, 21.54f, 16.59f, 21.89f)
                curveTo(16.48f, 21.91f, 16.36f, 21.93f, 16.24f, 21.94f)
                curveTo(16.12f, 21.96f, 16.01f, 21.97f, 15.89f, 21.98f)
                curveTo(15.76f, 21.99f, 15.62f, 22f, 15.48f, 22f)
                horizontalLineTo(7.52f)
                curveTo(7.38f, 22f, 7.24f, 21.99f, 7.11f, 21.98f)
                curveTo(6.99f, 21.97f, 6.88f, 21.96f, 6.76f, 21.94f)
                curveTo(6.64f, 21.93f, 6.52f, 21.91f, 6.41f, 21.89f)
                curveTo(4f, 21.54f, 2.46f, 20.01f, 2.11f, 17.59f)
                curveTo(2.09f, 17.48f, 2.07f, 17.36f, 2.06f, 17.24f)
                curveTo(2.04f, 17.12f, 2.03f, 17.01f, 2.02f, 16.89f)
                curveTo(2.01f, 16.76f, 2f, 16.62f, 2f, 16.48f)
                verticalLineTo(8.52f)
                curveTo(2f, 8.38f, 2.01f, 8.24f, 2.02f, 8.11f)
                curveTo(2.03f, 7.99f, 2.04f, 7.88f, 2.06f, 7.76f)
                curveTo(2.07f, 7.64f, 2.09f, 7.52f, 2.11f, 7.41f)
                curveTo(2.46f, 4.99f, 4f, 3.46f, 6.41f, 3.11f)
                curveTo(6.52f, 3.09f, 6.64f, 3.07f, 6.76f, 3.06f)
                curveTo(6.88f, 3.04f, 6.99f, 3.03f, 7.11f, 3.02f)
                curveTo(7.24f, 3.01f, 7.38f, 3f, 7.52f, 3f)
                horizontalLineTo(13.6f)
                curveTo(14.24f, 3f, 14.7f, 3.58f, 14.58f, 4.2f)
                curveTo(14.58f, 4.22f, 14.57f, 4.24f, 14.57f, 4.26f)
                curveTo(14.55f, 4.36f, 14.54f, 4.46f, 14.52f, 4.57f)
                curveTo(14.48f, 4.99f, 14.5f, 5.44f, 14.59f, 5.9f)
                curveTo(14.62f, 6.02f, 14.64f, 6.12f, 14.68f, 6.23f)
                curveTo(14.76f, 6.56f, 14.89f, 6.87f, 15.06f, 7.16f)
                curveTo(15.12f, 7.28f, 15.2f, 7.4f, 15.27f, 7.51f)
                curveTo(15.6f, 7.99f, 16.01f, 8.4f, 16.49f, 8.73f)
                curveTo(16.6f, 8.8f, 16.72f, 8.88f, 16.84f, 8.94f)
                curveTo(17.13f, 9.11f, 17.44f, 9.24f, 17.77f, 9.32f)
                curveTo(17.88f, 9.36f, 17.98f, 9.38f, 18.1f, 9.41f)
                curveTo(18.56f, 9.5f, 19.01f, 9.52f, 19.43f, 9.48f)
                curveTo(19.54f, 9.46f, 19.64f, 9.45f, 19.74f, 9.43f)
                curveTo(19.76f, 9.43f, 19.78f, 9.42f, 19.8f, 9.42f)
                curveTo(20.42f, 9.3f, 21f, 9.76f, 21f, 10.4f)
                close()
            }
        }.build()

        return _Notification1!!
    }

@Suppress("ObjectPropertyName")
private var _Notification1: ImageVector? = null
