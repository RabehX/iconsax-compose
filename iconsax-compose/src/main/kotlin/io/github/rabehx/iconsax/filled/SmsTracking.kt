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


val Iconsax.Filled.SmsTracking: ImageVector
    get() {
        if (_SmsTracking != null) {
            return _SmsTracking!!
        }
        _SmsTracking = ImageVector.Builder(
            name = "Filled.SmsTracking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 13f)
                curveTo(3.24f, 13f, 1f, 15.23f, 1f, 18f)
                curveTo(1f, 20.77f, 3.24f, 23f, 6f, 23f)
                curveTo(8.76f, 23f, 11f, 20.76f, 11f, 18f)
                curveTo(11f, 15.24f, 8.77f, 13f, 6f, 13f)
                close()
                moveTo(3.96f, 15.96f)
                horizontalLineTo(6f)
                curveTo(6.38f, 15.96f, 6.68f, 16.27f, 6.68f, 16.64f)
                curveTo(6.68f, 17.01f, 6.38f, 17.32f, 6f, 17.32f)
                horizontalLineTo(3.96f)
                curveTo(3.58f, 17.32f, 3.28f, 17.01f, 3.28f, 16.64f)
                curveTo(3.28f, 16.27f, 3.58f, 15.96f, 3.96f, 15.96f)
                close()
                moveTo(8.04f, 20.04f)
                horizontalLineTo(3.96f)
                curveTo(3.58f, 20.04f, 3.28f, 19.73f, 3.28f, 19.36f)
                curveTo(3.28f, 18.99f, 3.59f, 18.68f, 3.96f, 18.68f)
                horizontalLineTo(8.05f)
                curveTo(8.43f, 18.68f, 8.73f, 18.99f, 8.73f, 19.36f)
                curveTo(8.73f, 19.73f, 8.42f, 20.04f, 8.04f, 20.04f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 3f)
                horizontalLineTo(7f)
                curveTo(4f, 3f, 2f, 4.5f, 2f, 8f)
                verticalLineTo(11.14f)
                curveTo(2f, 11.87f, 2.75f, 12.33f, 3.42f, 12.04f)
                curveTo(4.52f, 11.56f, 5.77f, 11.38f, 7.08f, 11.59f)
                curveTo(9.7f, 12.02f, 11.84f, 14.09f, 12.37f, 16.69f)
                curveTo(12.52f, 17.45f, 12.54f, 18.19f, 12.44f, 18.9f)
                curveTo(12.36f, 19.49f, 12.84f, 20.01f, 13.43f, 20.01f)
                horizontalLineTo(17f)
                curveTo(20f, 20.01f, 22f, 18.51f, 22f, 15.01f)
                verticalLineTo(8f)
                curveTo(22f, 4.5f, 20f, 3f, 17f, 3f)
                close()
                moveTo(17.47f, 8.59f)
                lineTo(14.34f, 11.09f)
                curveTo(13.68f, 11.62f, 12.84f, 11.88f, 12f, 11.88f)
                curveTo(11.16f, 11.88f, 10.31f, 11.62f, 9.66f, 11.09f)
                lineTo(6.53f, 8.59f)
                curveTo(6.21f, 8.33f, 6.16f, 7.85f, 6.41f, 7.53f)
                curveTo(6.67f, 7.21f, 7.14f, 7.15f, 7.46f, 7.41f)
                lineTo(10.59f, 9.91f)
                curveTo(11.35f, 10.52f, 12.64f, 10.52f, 13.4f, 9.91f)
                lineTo(16.53f, 7.41f)
                curveTo(16.85f, 7.15f, 17.33f, 7.2f, 17.58f, 7.53f)
                curveTo(17.84f, 7.85f, 17.79f, 8.33f, 17.47f, 8.59f)
                close()
            }
        }.build()

        return _SmsTracking!!
    }

@Suppress("ObjectPropertyName")
private var _SmsTracking: ImageVector? = null
