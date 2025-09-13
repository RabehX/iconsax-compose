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


val Iconsax.Filled.SmsEdit: ImageVector
    get() {
        if (_SmsEdit != null) {
            return _SmsEdit!!
        }
        _SmsEdit = ImageVector.Builder(
            name = "Filled.SmsEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 3f)
                horizontalLineTo(7f)
                curveTo(4f, 3f, 2f, 4.5f, 2f, 8f)
                verticalLineTo(15f)
                curveTo(2f, 18.5f, 4f, 20f, 7f, 20f)
                horizontalLineTo(10.57f)
                curveTo(11.16f, 20f, 11.64f, 19.48f, 11.56f, 18.89f)
                curveTo(11.46f, 18.18f, 11.48f, 17.44f, 11.63f, 16.68f)
                curveTo(12.16f, 14.08f, 14.3f, 12.01f, 16.92f, 11.58f)
                curveTo(18.23f, 11.37f, 19.48f, 11.55f, 20.58f, 12.03f)
                curveTo(21.25f, 12.32f, 22f, 11.86f, 22f, 11.13f)
                verticalLineTo(8f)
                curveTo(22f, 4.5f, 20f, 3f, 17f, 3f)
                close()
                moveTo(17.47f, 8.59f)
                lineTo(14.34f, 11.09f)
                curveTo(13.68f, 11.62f, 12.84f, 11.88f, 12f, 11.88f)
                curveTo(11.16f, 11.88f, 10.31f, 11.62f, 9.66f, 11.09f)
                lineTo(6.53f, 8.59f)
                curveTo(6.21f, 8.33f, 6.16f, 7.86f, 6.41f, 7.53f)
                curveTo(6.67f, 7.21f, 7.14f, 7.15f, 7.46f, 7.41f)
                lineTo(10.59f, 9.91f)
                curveTo(11.35f, 10.52f, 12.64f, 10.52f, 13.4f, 9.91f)
                lineTo(16.53f, 7.41f)
                curveTo(16.85f, 7.15f, 17.33f, 7.2f, 17.58f, 7.53f)
                curveTo(17.84f, 7.86f, 17.79f, 8.33f, 17.47f, 8.59f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 13f)
                curveTo(15.24f, 13f, 13f, 15.23f, 13f, 18f)
                curveTo(13f, 20.76f, 15.24f, 23f, 18f, 23f)
                curveTo(20.77f, 23f, 23f, 20.76f, 23f, 18f)
                curveTo(23f, 15.23f, 20.77f, 13f, 18f, 13f)
                close()
                moveTo(20.05f, 17.55f)
                lineTo(19.68f, 17.91f)
                lineTo(17.5f, 20.1f)
                curveTo(17.4f, 20.19f, 17.21f, 20.29f, 17.07f, 20.31f)
                lineTo(16.09f, 20.45f)
                curveTo(15.74f, 20.5f, 15.49f, 20.25f, 15.54f, 19.9f)
                lineTo(15.68f, 18.92f)
                curveTo(15.7f, 18.78f, 15.79f, 18.59f, 15.89f, 18.49f)
                lineTo(18.07f, 16.32f)
                lineTo(18.43f, 15.95f)
                curveTo(18.67f, 15.71f, 18.94f, 15.55f, 19.22f, 15.55f)
                curveTo(19.46f, 15.55f, 19.73f, 15.66f, 20.03f, 15.95f)
                curveTo(20.7f, 16.6f, 20.49f, 17.11f, 20.05f, 17.55f)
                close()
            }
        }.build()

        return _SmsEdit!!
    }

@Suppress("ObjectPropertyName")
private var _SmsEdit: ImageVector? = null
