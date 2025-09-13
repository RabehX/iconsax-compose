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


val Iconsax.Filled.MessageEdit: ImageVector
    get() {
        if (_MessageEdit != null) {
            return _MessageEdit!!
        }
        _MessageEdit = ImageVector.Builder(
            name = "Filled.MessageEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 2f)
                horizontalLineTo(8f)
                curveTo(4f, 2f, 2f, 4f, 2f, 8f)
                verticalLineTo(21f)
                curveTo(2f, 21.55f, 2.45f, 22f, 3f, 22f)
                horizontalLineTo(16f)
                curveTo(20f, 22f, 22f, 20f, 22f, 16f)
                verticalLineTo(8f)
                curveTo(22f, 4f, 20f, 2f, 16f, 2f)
                close()
                moveTo(11.11f, 16.66f)
                curveTo(10.86f, 16.91f, 10.4f, 17.14f, 10.06f, 17.19f)
                lineTo(7.98f, 17.48f)
                curveTo(7.9f, 17.49f, 7.82f, 17.5f, 7.75f, 17.5f)
                curveTo(7.4f, 17.5f, 7.08f, 17.38f, 6.85f, 17.15f)
                curveTo(6.57f, 16.87f, 6.45f, 16.46f, 6.52f, 16.02f)
                lineTo(6.81f, 13.94f)
                curveTo(6.86f, 13.6f, 7.09f, 13.13f, 7.34f, 12.89f)
                lineTo(11.11f, 9.12f)
                curveTo(11.17f, 9.3f, 11.25f, 9.48f, 11.34f, 9.68f)
                curveTo(11.43f, 9.86f, 11.52f, 10.04f, 11.62f, 10.21f)
                curveTo(11.7f, 10.35f, 11.79f, 10.49f, 11.87f, 10.59f)
                curveTo(11.97f, 10.74f, 12.07f, 10.87f, 12.14f, 10.94f)
                curveTo(12.18f, 11f, 12.22f, 11.04f, 12.23f, 11.06f)
                curveTo(12.45f, 11.31f, 12.68f, 11.55f, 12.9f, 11.73f)
                curveTo(12.96f, 11.79f, 13f, 11.82f, 13.01f, 11.83f)
                curveTo(13.14f, 11.93f, 13.26f, 12.04f, 13.38f, 12.11f)
                curveTo(13.51f, 12.21f, 13.65f, 12.3f, 13.79f, 12.38f)
                curveTo(13.96f, 12.48f, 14.14f, 12.58f, 14.33f, 12.67f)
                curveTo(14.52f, 12.76f, 14.7f, 12.83f, 14.88f, 12.89f)
                lineTo(11.11f, 16.66f)
                close()
                moveTo(16.55f, 11.23f)
                lineTo(15.77f, 12.01f)
                curveTo(15.72f, 12.06f, 15.65f, 12.09f, 15.58f, 12.09f)
                curveTo(15.56f, 12.09f, 15.52f, 12.09f, 15.5f, 12.08f)
                curveTo(13.78f, 11.59f, 12.41f, 10.22f, 11.92f, 8.5f)
                curveTo(11.89f, 8.41f, 11.92f, 8.31f, 11.99f, 8.24f)
                lineTo(12.78f, 7.45f)
                curveTo(14.07f, 6.16f, 15.29f, 6.19f, 16.55f, 7.45f)
                curveTo(17.19f, 8.09f, 17.51f, 8.71f, 17.5f, 9.35f)
                curveTo(17.5f, 9.98f, 17.19f, 10.59f, 16.55f, 11.23f)
                close()
            }
        }.build()

        return _MessageEdit!!
    }

@Suppress("ObjectPropertyName")
private var _MessageEdit: ImageVector? = null
