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

val Iconsax.Outline.ClipboardText: ImageVector
    get() {
        if (_ClipboardText != null) {
            return _ClipboardText!!
        }
        _ClipboardText = ImageVector.Builder(
            name = "Outline.ClipboardText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 12.95f)
                horizontalLineTo(8f)
                curveTo(7.59f, 12.95f, 7.25f, 12.61f, 7.25f, 12.2f)
                curveTo(7.25f, 11.79f, 7.59f, 11.45f, 8f, 11.45f)
                horizontalLineTo(15f)
                curveTo(15.41f, 11.45f, 15.75f, 11.79f, 15.75f, 12.2f)
                curveTo(15.75f, 12.61f, 15.41f, 12.95f, 15f, 12.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.38f, 16.95f)
                horizontalLineTo(8f)
                curveTo(7.59f, 16.95f, 7.25f, 16.61f, 7.25f, 16.2f)
                curveTo(7.25f, 15.79f, 7.59f, 15.45f, 8f, 15.45f)
                horizontalLineTo(12.38f)
                curveTo(12.79f, 15.45f, 13.13f, 15.79f, 13.13f, 16.2f)
                curveTo(13.13f, 16.61f, 12.79f, 16.95f, 12.38f, 16.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 6.75f)
                horizontalLineTo(10f)
                curveTo(9.04f, 6.75f, 7.25f, 6.75f, 7.25f, 4f)
                curveTo(7.25f, 1.25f, 9.04f, 1.25f, 10f, 1.25f)
                horizontalLineTo(14f)
                curveTo(14.96f, 1.25f, 16.75f, 1.25f, 16.75f, 4f)
                curveTo(16.75f, 4.96f, 16.75f, 6.75f, 14f, 6.75f)
                close()
                moveTo(10f, 2.75f)
                curveTo(9.01f, 2.75f, 8.75f, 2.75f, 8.75f, 4f)
                curveTo(8.75f, 5.25f, 9.01f, 5.25f, 10f, 5.25f)
                horizontalLineTo(14f)
                curveTo(15.25f, 5.25f, 15.25f, 4.99f, 15.25f, 4f)
                curveTo(15.25f, 2.75f, 14.99f, 2.75f, 14f, 2.75f)
                horizontalLineTo(10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.38f, 22.75f, 2.25f, 20.17f, 2.25f, 16f)
                verticalLineTo(10f)
                curveTo(2.25f, 5.44f, 3.9f, 3.49f, 7.96f, 3.28f)
                curveTo(8.36f, 3.26f, 8.73f, 3.57f, 8.75f, 3.99f)
                curveTo(8.77f, 4.41f, 8.45f, 4.75f, 8.04f, 4.77f)
                curveTo(5.2f, 4.93f, 3.75f, 5.78f, 3.75f, 10f)
                verticalLineTo(16f)
                curveTo(3.75f, 19.7f, 4.48f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.52f, 21.25f, 20.25f, 19.7f, 20.25f, 16f)
                verticalLineTo(10f)
                curveTo(20.25f, 5.78f, 18.8f, 4.93f, 15.96f, 4.77f)
                curveTo(15.55f, 4.75f, 15.23f, 4.39f, 15.25f, 3.98f)
                curveTo(15.27f, 3.57f, 15.63f, 3.25f, 16.04f, 3.27f)
                curveTo(20.1f, 3.49f, 21.75f, 5.44f, 21.75f, 9.99f)
                verticalLineTo(15.99f)
                curveTo(21.75f, 20.17f, 20.62f, 22.75f, 15f, 22.75f)
                close()
            }
        }.build()

        return _ClipboardText!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardText: ImageVector? = null
