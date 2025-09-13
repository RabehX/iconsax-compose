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


val Iconsax.Filled.MessageTick: ImageVector
    get() {
        if (_MessageTick != null) {
            return _MessageTick!!
        }
        _MessageTick = ImageVector.Builder(
            name = "Filled.MessageTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 13.5f)
                curveTo(2.79f, 13.5f, 1f, 15.29f, 1f, 17.5f)
                curveTo(1f, 18.25f, 1.21f, 18.96f, 1.58f, 19.56f)
                curveTo(2.27f, 20.72f, 3.54f, 21.5f, 5f, 21.5f)
                curveTo(6.46f, 21.5f, 7.73f, 20.72f, 8.42f, 19.56f)
                curveTo(8.79f, 18.96f, 9f, 18.25f, 9f, 17.5f)
                curveTo(9f, 15.29f, 7.21f, 13.5f, 5f, 13.5f)
                close()
                moveTo(6.97f, 17.17f)
                lineTo(4.84f, 19.14f)
                curveTo(4.7f, 19.27f, 4.51f, 19.34f, 4.33f, 19.34f)
                curveTo(4.14f, 19.34f, 3.95f, 19.27f, 3.8f, 19.12f)
                lineTo(2.81f, 18.13f)
                curveTo(2.52f, 17.84f, 2.52f, 17.36f, 2.81f, 17.07f)
                curveTo(3.1f, 16.78f, 3.58f, 16.78f, 3.87f, 17.07f)
                lineTo(4.35f, 17.55f)
                lineTo(5.95f, 16.07f)
                curveTo(6.25f, 15.79f, 6.73f, 15.81f, 7.01f, 16.11f)
                curveTo(7.29f, 16.41f, 7.27f, 16.89f, 6.97f, 17.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.25f, 2.43f)
                horizontalLineTo(7.75f)
                curveTo(4.9f, 2.43f, 3f, 4.33f, 3f, 7.18f)
                verticalLineTo(11.64f)
                curveTo(3f, 11.99f, 3.36f, 12.24f, 3.7f, 12.15f)
                curveTo(4.12f, 12.05f, 4.55f, 12f, 5f, 12f)
                curveTo(7.86f, 12f, 10.22f, 14.32f, 10.48f, 17.13f)
                curveTo(10.5f, 17.41f, 10.73f, 17.63f, 11f, 17.63f)
                horizontalLineTo(11.55f)
                lineTo(15.78f, 20.45f)
                curveTo(16.4f, 20.87f, 17.25f, 20.41f, 17.25f, 19.65f)
                verticalLineTo(17.63f)
                curveTo(18.67f, 17.63f, 19.86f, 17.15f, 20.69f, 16.33f)
                curveTo(21.52f, 15.49f, 22f, 14.3f, 22f, 12.88f)
                verticalLineTo(7.18f)
                curveTo(22f, 4.33f, 20.1f, 2.43f, 17.25f, 2.43f)
                close()
                moveTo(15.83f, 10.81f)
                horizontalLineTo(9.17f)
                curveTo(8.78f, 10.81f, 8.46f, 10.49f, 8.46f, 10.1f)
                curveTo(8.46f, 9.7f, 8.78f, 9.38f, 9.17f, 9.38f)
                horizontalLineTo(15.83f)
                curveTo(16.22f, 9.38f, 16.54f, 9.7f, 16.54f, 10.1f)
                curveTo(16.54f, 10.49f, 16.22f, 10.81f, 15.83f, 10.81f)
                close()
            }
        }.build()

        return _MessageTick!!
    }

@Suppress("ObjectPropertyName")
private var _MessageTick: ImageVector? = null
