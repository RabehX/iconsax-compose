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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.BatteryCharging: ImageVector
    get() {
        if (_BatteryCharging != null) {
            return _BatteryCharging!!
        }
        _BatteryCharging = ImageVector.Builder(
            name = "Outline.BatteryCharging",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 15.25f)
                curveTo(20.09f, 15.25f, 19.75f, 14.91f, 19.75f, 14.5f)
                curveTo(19.75f, 14.09f, 20.09f, 13.75f, 20.5f, 13.75f)
                curveTo(21.09f, 13.75f, 21.22f, 13.66f, 21.23f, 13.66f)
                curveTo(21.25f, 13.6f, 21.25f, 13.25f, 21.25f, 13f)
                verticalLineTo(11f)
                curveTo(21.25f, 10.75f, 21.25f, 10.41f, 21.21f, 10.32f)
                curveTo(21.2f, 10.33f, 21.05f, 10.25f, 20.5f, 10.25f)
                curveTo(20.09f, 10.25f, 19.75f, 9.91f, 19.75f, 9.5f)
                curveTo(19.75f, 9.09f, 20.09f, 8.75f, 20.5f, 8.75f)
                curveTo(22.58f, 8.75f, 22.75f, 9.77f, 22.75f, 11f)
                verticalLineTo(13f)
                curveTo(22.75f, 14.23f, 22.58f, 15.25f, 20.5f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.001f, 16.75f)
                curveTo(9.831f, 16.75f, 9.651f, 16.69f, 9.511f, 16.57f)
                curveTo(9.201f, 16.3f, 9.161f, 15.83f, 9.431f, 15.51f)
                lineTo(11.511f, 13.08f)
                curveTo(11.541f, 12.99f, 11.511f, 12.91f, 11.491f, 12.87f)
                curveTo(11.461f, 12.82f, 11.401f, 12.75f, 11.271f, 12.75f)
                horizontalLineTo(8.971f)
                curveTo(8.341f, 12.75f, 7.771f, 12.42f, 7.451f, 11.88f)
                curveTo(7.131f, 11.34f, 7.131f, 10.68f, 7.451f, 10.13f)
                lineTo(9.401f, 7.55f)
                curveTo(9.651f, 7.22f, 10.121f, 7.15f, 10.451f, 7.4f)
                curveTo(10.781f, 7.65f, 10.851f, 8.12f, 10.601f, 8.45f)
                lineTo(8.711f, 10.95f)
                curveTo(8.701f, 10.98f, 8.741f, 11.07f, 8.761f, 11.12f)
                curveTo(8.791f, 11.17f, 8.851f, 11.24f, 8.981f, 11.24f)
                horizontalLineTo(11.281f)
                curveTo(11.911f, 11.24f, 12.481f, 11.57f, 12.801f, 12.11f)
                curveTo(13.121f, 12.65f, 13.121f, 13.31f, 12.801f, 13.86f)
                curveTo(12.781f, 13.9f, 12.751f, 13.94f, 12.721f, 13.97f)
                lineTo(10.581f, 16.47f)
                curveTo(10.421f, 16.66f, 10.211f, 16.75f, 10.001f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 19.75f)
                curveTo(2.59f, 19.75f, 1.25f, 18.41f, 1.25f, 14f)
                verticalLineTo(10f)
                curveTo(1.25f, 5.59f, 2.59f, 4.25f, 7f, 4.25f)
                curveTo(7.41f, 4.25f, 7.75f, 4.59f, 7.75f, 5f)
                curveTo(7.75f, 5.41f, 7.41f, 5.75f, 7f, 5.75f)
                curveTo(3.43f, 5.75f, 2.75f, 6.43f, 2.75f, 10f)
                verticalLineTo(14f)
                curveTo(2.75f, 17.57f, 3.43f, 18.25f, 7f, 18.25f)
                curveTo(7.41f, 18.25f, 7.75f, 18.59f, 7.75f, 19f)
                curveTo(7.75f, 19.41f, 7.41f, 19.75f, 7f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 19.75f)
                curveTo(12.59f, 19.75f, 12.25f, 19.41f, 12.25f, 19f)
                curveTo(12.25f, 18.59f, 12.59f, 18.25f, 13f, 18.25f)
                curveTo(16.57f, 18.25f, 17.25f, 17.57f, 17.25f, 14f)
                verticalLineTo(10f)
                curveTo(17.25f, 6.43f, 16.57f, 5.75f, 13f, 5.75f)
                curveTo(12.59f, 5.75f, 12.25f, 5.41f, 12.25f, 5f)
                curveTo(12.25f, 4.59f, 12.59f, 4.25f, 13f, 4.25f)
                curveTo(17.41f, 4.25f, 18.75f, 5.59f, 18.75f, 10f)
                verticalLineTo(14f)
                curveTo(18.75f, 18.41f, 17.41f, 19.75f, 13f, 19.75f)
                close()
            }
        }.build()

        return _BatteryCharging!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryCharging: ImageVector? = null
