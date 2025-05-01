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

val Iconsax.Outline.Bluetooth: ImageVector
    get() {
        if (_Bluetooth != null) {
            return _Bluetooth!!
        }
        _Bluetooth = ImageVector.Builder(
            name = "Outline.Bluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.13f, 22.75f)
                curveTo(12.86f, 22.75f, 12.65f, 22.68f, 12.5f, 22.61f)
                curveTo(12.14f, 22.44f, 11.53f, 21.97f, 11.53f, 20.71f)
                verticalLineTo(14.26f)
                lineTo(6.14f, 19.2f)
                curveTo(5.84f, 19.48f, 5.36f, 19.46f, 5.08f, 19.15f)
                curveTo(4.8f, 18.84f, 4.82f, 18.37f, 5.13f, 18.09f)
                lineTo(11.53f, 12.22f)
                verticalLineTo(11.77f)
                lineTo(5.13f, 5.9f)
                curveTo(4.82f, 5.62f, 4.8f, 5.15f, 5.08f, 4.84f)
                curveTo(5.36f, 4.54f, 5.84f, 4.51f, 6.14f, 4.79f)
                lineTo(11.53f, 9.73f)
                verticalLineTo(3.28f)
                curveTo(11.53f, 2.02f, 12.14f, 1.54f, 12.5f, 1.38f)
                curveTo(12.86f, 1.21f, 13.61f, 1.05f, 14.58f, 1.86f)
                lineTo(18.43f, 5.07f)
                curveTo(18.85f, 5.42f, 19.1f, 5.92f, 19.11f, 6.45f)
                curveTo(19.12f, 6.98f, 18.9f, 7.49f, 18.49f, 7.86f)
                lineTo(13.99f, 11.99f)
                lineTo(18.49f, 16.12f)
                curveTo(18.89f, 16.49f, 19.12f, 17.01f, 19.11f, 17.53f)
                curveTo(19.1f, 18.06f, 18.85f, 18.56f, 18.43f, 18.91f)
                lineTo(14.58f, 22.12f)
                curveTo(14.01f, 22.61f, 13.51f, 22.75f, 13.13f, 22.75f)
                close()
                moveTo(13.03f, 13.15f)
                verticalLineTo(20.71f)
                curveTo(13.03f, 21.08f, 13.11f, 21.24f, 13.15f, 21.26f)
                curveTo(13.16f, 21.25f, 13.34f, 21.21f, 13.62f, 20.98f)
                lineTo(17.47f, 17.77f)
                curveTo(17.56f, 17.69f, 17.61f, 17.6f, 17.61f, 17.5f)
                curveTo(17.61f, 17.4f, 17.57f, 17.31f, 17.48f, 17.23f)
                lineTo(13.03f, 13.15f)
                close()
                moveTo(13.12f, 2.75f)
                curveTo(13.11f, 2.76f, 13.03f, 2.93f, 13.03f, 3.29f)
                verticalLineTo(10.85f)
                lineTo(17.48f, 6.77f)
                curveTo(17.57f, 6.69f, 17.61f, 6.6f, 17.61f, 6.5f)
                curveTo(17.61f, 6.4f, 17.56f, 6.31f, 17.47f, 6.23f)
                lineTo(13.61f, 3.02f)
                curveTo(13.35f, 2.8f, 13.18f, 2.75f, 13.12f, 2.75f)
                close()
            }
        }.build()

        return _Bluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _Bluetooth: ImageVector? = null
